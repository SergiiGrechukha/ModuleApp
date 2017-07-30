package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1421 {

    @Ignore    private SampleClass1422 sampleClass;

    public SampleClass1421(){
        sampleClass = new SampleClass1422();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}