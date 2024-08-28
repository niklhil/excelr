import React,{useState} from 'react';
import * as yup from 'yup';
import 'bootstrap/dist/css/bootstrap.min.css';
function App{
    const [firstName,setFirstName]=useState('');
    const [lastName,setlastName]=useState('');
    const [mobile,setMobile]=useState('');
    const [age,setAge]=useState('');
    const [email,setEmail]=useState('');
    const [password,setPassword]=useState('');
    const [errors,setErrors]=useState('{}');

    const userSchema=yup.object().shape(
        {
            firstName:yup.string().required('first name is required'),
            lastName:yup.string(),
            email:yup.string().email('invalid emial').required('emailis required'),
            password:yup.string().min(8,'password must be atleast 8 charecters').required(password is required),
            age:yup.number().typeError('age musgt be number').integer('age must be an integer').min(18,'age must be atleast 18').max(80,'age must be atmost 80').required('age is required'),
            mobile:yup.string().matches(/^\d{10}$/,'mobile must be 10 digit').required('mobile is required'),
        }
    );

    async function validateForm()
    {
        try{
            await userSchema.validate({
                firstName,lastName,email,password,age,mobile,
            },{abortEarly:false});
            setErrors({});
            alert('form is valid');

        }
        catch(error){
            const errorMessages={};
            error.inner.forEach((e)=>{
                errorMessages[e.path]=e.message;
            });
            setErrors(errorMessages);
        }
    }

    return(
        <div className='container mt-5'>
            <div className='row justify-content-center'>
                <div className='col-md-6'>
                    <input 
                    type='text'
                    className='form-control'
                    id='firstName'
                    value={firstName}
                    onChange={(e)=>setFirstName(e.target.value)}
                    />
                    <div className='text-danger'>{errors.firstName}</div>
                    </div>
                    <div className='mb-3'>
                        <label htmlFor='lastName' className='form-label'>Last Name:</label>
                        <input type='text' className='form-control'
                        id='lastName' value={lastName} 
                        onChange={(e)=>setlastName(e.target.value)}
                        />

                        <div className='mb-3'>
                            <label htmlFor='mobile' className='form-label'>mobile:</label>
                            < input type='text' className='form-control' 
                            id='mobile'
                            value={mobile}
                            onChange={(e)=>setMobile(e.target.value)}/>
                            <div className='text-danger'>{mobile.number}</div>

                            <div className='mb-3'>
                            <label htmlFor='age' className='form-label'>age:</label>
                            < input type='text' className='form-control' 
                            id='age'
                            value={age}
                            onChange={(e)=>setAge(e.target.value)}/>
                            <div className='text-danger'>{errors.age}</div>

                            <div className='mb-3'>
                            <label htmlFor='email' className='form-label'>email:</label>
                            < input type='text' className='form-control' 
                            id='email'
                            value={email}
                            onChange={(e)=>setMobile(e.target.value)}/>
                            <div className='text-danger'>{errors.email}</div>

                            <div className='mb-3'>
                            <label htmlFor='password' className='form-label'>mobile:</label>
                            < input type='password' className='form-control' 
                            id='password'
                            value={password}
                            onChange={(e)=>setPassword(e.target.value)}/>
                            <div className='text-danger'>{errors.password}</div>
                            <button type='button' className='btn btn-primary'
                            onClick={validateForm}>submit</button>
                            </form>
                        </div>
                     </div>   
                </div>
            </div>
        </div>
    ); 
    } 
       
