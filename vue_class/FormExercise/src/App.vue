<template>

    <div class="container">
        <form v-if="!isSubmitted">
            <div class="row">
                <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                    <h1>My form</h1>
                    <full-name v-model="fullname"></full-name>
                    <div class="form-group">
                        <label for="email">E-mail</label>
                        <input type="email" id="email" class="form-control" placeholder="Email" v-model="email">
                    </div>
                    <div class="form-group">
                        <label for="firstname">Password</label>
                        <input type="password" id="password" class="form-control" placeholder="Password" v-model="password">
                    </div>

                    <div class="form-group">
                        <label class="form-label">Store Data</label>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="storeData" id="storeData" value="yes" v-model="storeData">
                            <label class="form-check-label" for="storeData">yes</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="storeData" id="storeData2" value="no" v-model="storeData"> 
                            <label class="form-check-label" for="storeData">no</label>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary" @click.prevent="submitted">Submit</button>
                    </div>

                    
                    <!-- Exercise 1 -->
                    <!-- Create a Signup Form where you retrieve the following Information -->
                    <!-- Full Name (First Name + Last Name) -->
                    <!-- Mail -->
                    <!-- Password -->
                    <!-- Store Data? Yes/No -->

                    <!-- Exercise 2 -->
                    <!-- Only display the Form if it has NOT been submitted -->
                    <!-- Display the Data Summary ONCE the Form HAS been submitted -->

                    <!-- Exercise 3 -->
                    <!-- Edit the Example from above and create a custom "Full Name" Control -->
                    <!-- which still holds the First Name and Last Name Input Field -->
                </div>
            </div>
        </form>
        <hr>
        <div class="row">
            <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <div class="card">
                    <div class="card-header">
                        <h4>Your Data</h4>
                    </div>
                    <div class="card-body">
                        <p>Full Name: {{ fullname }}</p>
                        <p>Mail: {{email}}</p>
                        <p>Password: {{password}}</p>
                        <p>Store in Database?: {{storeData}}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import FullName from './FullName.vue'
    export default {
        data(){
            return{
                fullname: "Hello World",
                email: "",
                password: "",
                storeData: false,
                isSubmitted: false,
            };
        },
        components:{
            FullName
        },
        methods:{
            submitted(){
                this.isSubmitted = true;
            }
        }
    }
</script>

<style>
</style>
