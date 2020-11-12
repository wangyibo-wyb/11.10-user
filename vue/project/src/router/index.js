import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'Main',
        component: () => import('../views/Main'),
        meta: {title: '用户'},
        children: [
            {
                path: '/adduser',
                name: 'Adduser',
                component: () => import('../views/User/Adduser'),
                meta: {title: '添加用户'}
            },
          {
            path: '/showuser',
            name: 'Showuser',
            component: () => import('../views/User/Showuser'),
            meta: {title: '查看用户'}
          },
        ]
    },

]

const router = new VueRouter({
    routes
})

export default router
