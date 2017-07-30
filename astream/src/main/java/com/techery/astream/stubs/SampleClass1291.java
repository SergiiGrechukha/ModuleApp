package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1291 {

    @Ignore    private SampleClass1292 sampleClass;

    public SampleClass1291(){
        sampleClass = new SampleClass1292();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}