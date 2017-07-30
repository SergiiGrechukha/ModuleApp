package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass465 {

    @Ignore    private SampleClass466 sampleClass;

    public SampleClass465(){
        sampleClass = new SampleClass466();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}