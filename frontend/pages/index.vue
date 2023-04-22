<template>
    <div class="px-14 py-28">
        <h1 class="text-5xl mb-10">메인</h1>
        <p>{{ data }}</p>
    </div>
</template>

<script setup>
    const { data, pending, error, refresh } = await useFetch('http://localhost:8080/test')
</script>