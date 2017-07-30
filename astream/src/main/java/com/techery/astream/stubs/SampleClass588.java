package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass588 {

    @Ignore    private SampleClass589 sampleClass;

    public SampleClass588(){
        sampleClass = new SampleClass589();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}