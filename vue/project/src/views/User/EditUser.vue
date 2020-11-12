<template>
    <div style="width: 800px">
        <el-form ref="form" :model="adduserform" label-width="80px">
            <el-form-item label="姓名" prop="user_name">
                <el-input v-model="adduserform.user_name"></el-input>
            </el-form-item>
            <el-form-item label="性别" style="text-align: left">
                <el-radio-group v-model="adduserform.gender">
                    <el-radio label="1">男</el-radio>
                    <el-radio label="0">女</el-radio>
                </el-radio-group>
            </el-form-item>
            <el-form-item label="登录名" prop="login_name">
                <el-input v-model="adduserform.login_name"></el-input>
            </el-form-item>
            <el-form-item label="密码" prop="pwd">
                <el-input type="password" v-model="adduserform.pwd"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="edituser">立即添加</el-button>
                <el-button>取消</el-button>
            </el-form-item>
        </el-form>
    </div>
</template>

<script>
    import axios from "axios";

    export default {
        name: "Adduser",
        data(){
            return{
                adduserform:{
                    user_name:'',
                    gender:1,
                    login_name:'',
                    pwd:'',

                }
            }
        },
        methods:{
            edituser(){
                axios.put('http://localhost:8080/user',this.adduserform).then(res=>{
                    this.$router.push({name:"Showuser"})
                    console.log(res);

                })
            }
        }
    }
</script>

<style scoped>

</style>