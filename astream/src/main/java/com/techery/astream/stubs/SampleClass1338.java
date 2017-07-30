package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1338 {

    @Ignore    private SampleClass1339 sampleClass;

    public SampleClass1338(){
        sampleClass = new SampleClass1339();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}