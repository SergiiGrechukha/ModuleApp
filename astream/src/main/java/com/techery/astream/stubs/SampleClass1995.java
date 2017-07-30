package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1995 {

    @Ignore    private SampleClass1996 sampleClass;

    public SampleClass1995(){
        sampleClass = new SampleClass1996();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}