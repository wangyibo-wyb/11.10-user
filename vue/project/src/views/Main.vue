<template>
    <div class="container">
        <el-container class="main-box">
            <el-header>用户管理</el-header>
            <el-container>
                <el-aside width="200px">
                    <el-menu
                            default-active="2"
                            class="el-menu-vertical-demo"
                            style="background: #D3DCE6">
                        <el-menu-item index="1">
                            <i class="el-icon-menu"></i>
                            <span slot="title">
                                <router-link to="Adduser">添加用户</router-link>
                            </span>
                        </el-menu-item>
                        <el-menu-item index="2">
                            <i class="el-icon-document"></i>
                            <span slot="title">
                                <router-link to="Showuser">查看用户</router-link>
                            </span>
                        </el-menu-item>

                    </el-menu>
                </el-aside>
                <el-container>
                    <el-main>
                        <router-view></router-view>
                    </el-main>
                </el-container>
            </el-container>
        </el-container>
    </div>
</template>

<script>

    export default {
        name: "Main"
    }
</script>

<style scoped>

</style>
<style>
    a{
        color: #333333;
        text-decoration: none;
    }

    .main-box {
        position: absolute;
        left: 0;
        top: 0;
        right: 0;
        bottom: 0;
    }

    .el-header {
        background-color: #B3C0D1;
        color: #333;
        font-size: 30px;
        line-height: 60px;
        text-align: center;
    }

    .nav {
        width: 250px;
        height: 100%;
    }


    .el-aside {
        background-color: #D3DCE6;
        color: #333;
    }

    .el-main {
        background-color: #E9EEF3;
        color: #333;
    }

    body > .el-container {
        margin-bottom: 40px;
    }

    .el-container:nth-child(5) .el-aside,
    .el-container:nth-child(6) .el-aside {
        line-height: 260px;
    }

    .el-container:nth-child(7) .el-aside {
        line-height: 320px;
    }

    .el-submenu__title{
        font-size: 20px!important;
    }

    .el-menu-item{
        font-size: 20px!important;
    }
</style>