package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass3 {

    @Ignore    private SampleClass4 sampleClass;

    public SampleClass3(){
        sampleClass = new SampleClass4();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}