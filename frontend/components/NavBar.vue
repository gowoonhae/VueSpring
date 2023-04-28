<template>
    <nav class="fixed z-50 w-full bg-slate-300 space-x-4 text-2xl p-4">
        <span><NuxtLink to="/">메인</NuxtLink></span>
        <span @click="$router.go(0)"><NuxtLink to="/create">등록</NuxtLink></span>
        <span><NuxtLink to="/member">회원</NuxtLink></span>
        <span class="float-right"><NuxtLink to="/login">로그인</NuxtLink></span>
        <span class="float-right"><NuxtLink to="/logout">로그아웃</NuxtLink></span>
    </nav>
</template>