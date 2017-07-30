package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass289 {

    @Ignore    private SampleClass290 sampleClass;

    public SampleClass289(){
        sampleClass = new SampleClass290();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}