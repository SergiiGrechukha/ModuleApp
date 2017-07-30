package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass421 {

    @Ignore    private SampleClass422 sampleClass;

    public SampleClass421(){
        sampleClass = new SampleClass422();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}