<template>
    <div>
        <el-table
                :data="userform"
                stripe
                style="width: 90%">
            <el-table-column
                    prop="user_name"
                    label="姓名"
                    width="180">
            </el-table-column>
            <el-table-column
                    prop="gender"
                    label="性别"
                    width="180">
            </el-table-column>
            <el-table-column
                    prop="login_name"
                    label="登录名"
                    width="180"
            >
            </el-table-column>
            <el-table-column
                    prop="pwd"
                    label="密码"
                    width="180">
            </el-table-column>
            <el-table-column
                    prop="status"
                    label="状态"
                    width="180">
            </el-table-column>
            <el-table-column
                    prop="create_time"
                    label="创建时间"
                    width="250">
            </el-table-column>
            <el-table-column
                    prop="deleted"
                    label="删除标记位"
                    width="180">
            </el-table-column>
            <el-table-column
                    label="操作"
                    width="180">
                <template slot-scope="scope">
                    <el-button type="primary" plain>编辑</el-button>
                    <el-button type="primary" plain @click="deleteuser(scope.row.user_id)">删除</el-button>
                </template>
            </el-table-column>
        </el-table>
    </div>
</template>

<script>
    import axios from "axios";
    export default {
        name: "Showuser",
        data() {
            return {
               userform: []
            }
        },
        methods:{
            initUser(){
                axios.get('http://localhost:8080/findAll').then(res=>{
                    this.userform = res.data;
                })
            },
            deleteuser(uid){
                axios.delete('http://localhost:8080/user/' + uid).then(res=>{
                    console.log(res);
                    this.initUser();
                    this.$message.success('删除成功');
                }).catch(error=>{
                    console.log(error);
                    this.$message.success('删除失败');
                })
            }
        },
        mounted() {
            this.initUser();
        }
    }
</script>

<style scoped>

</style>