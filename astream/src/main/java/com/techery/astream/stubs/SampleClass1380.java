package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1380 {

    @Ignore    private SampleClass1381 sampleClass;

    public SampleClass1380(){
        sampleClass = new SampleClass1381();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}