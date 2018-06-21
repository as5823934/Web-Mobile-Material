<template>
    <div class="col-la-4">
        <h3>Quotes Added</h3>
        <div class="progress">
            <div v-bind:style= "{width: quoteCount / maxQuote * 100 +'%'}" class="progress-bar" role="progressbar"
                        aria-valuemin="0" aria-valuemax="100">
                {{quoteCount}}/{{maxQuote}}
            </div>
        </div>
    </div>
</template>

<script>
export default {
    props:['quoteCount', 'maxQuote'],
    // use props to get value from parent

}
</script>

<style scoped>

</style>


