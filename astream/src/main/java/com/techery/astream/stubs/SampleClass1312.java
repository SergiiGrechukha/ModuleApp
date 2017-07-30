package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1312 {

    @Ignore    private SampleClass1313 sampleClass;

    public SampleClass1312(){
        sampleClass = new SampleClass1313();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}