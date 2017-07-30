package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1379 {

    @Ignore    private SampleClass1380 sampleClass;

    public SampleClass1379(){
        sampleClass = new SampleClass1380();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}