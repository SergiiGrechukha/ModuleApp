package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1313 {

    @Ignore    private SampleClass1314 sampleClass;

    public SampleClass1313(){
        sampleClass = new SampleClass1314();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}