<template>
    <div class="col-sm-8 col-sm-offset-2 col-xs-12 col-md-6 col-md-offset-3 from group">
        <form>
            <label>Quote</label>
            <textarea v-model="message" class="form-control" rows="3"></textarea>
        </form>
        <br>   
        <button type="button" class="btn btn-primary" @click.prevent="createNewQuote">Add Quote</button>
        <div>
            <br>
        </div>
    </div>
</template>

<script>
export default {
    data(){
        return{
            message:'',
        }
    },

    methods:{
        createNewQuote(){
            // alert("added");
            //use $emit pass data to parent
            this.$emit('quoteAdded', this.message);
            this.message='';
        }
    }
  
}
</script>

<style scoped>

</style>


