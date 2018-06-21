<template>
    <div>
        <my-quote style="white-space: pre-line;" v-for="(quote, index) in quotes" @click.native="deleteQuote(index)">{{ quote }}</my-quote>
    </div>
</template>

<script>
import Quote from './Quote.vue'

export default {
  props: ['quotes'],
  components: {
      myQuote: Quote,
  },
  methods:{
      deleteQuote(i){
        this.$emit('quoteDeleted', i);
      }
  }
}
</script>

<style scoped>
   
</style>


