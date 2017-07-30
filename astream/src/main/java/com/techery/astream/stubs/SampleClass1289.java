package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1289 {

    @Ignore    private SampleClass1290 sampleClass;

    public SampleClass1289(){
        sampleClass = new SampleClass1290();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}