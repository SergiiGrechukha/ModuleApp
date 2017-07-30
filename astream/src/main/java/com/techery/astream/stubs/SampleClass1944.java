package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1944 {

    @Ignore    private SampleClass1945 sampleClass;

    public SampleClass1944(){
        sampleClass = new SampleClass1945();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}