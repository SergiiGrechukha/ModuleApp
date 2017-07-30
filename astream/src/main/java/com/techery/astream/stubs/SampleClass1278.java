package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1278 {

    @Ignore    private SampleClass1279 sampleClass;

    public SampleClass1278(){
        sampleClass = new SampleClass1279();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}