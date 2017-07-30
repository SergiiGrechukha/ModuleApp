package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1323 {

    @Ignore    private SampleClass1324 sampleClass;

    public SampleClass1323(){
        sampleClass = new SampleClass1324();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}