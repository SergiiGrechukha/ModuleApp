package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass449 {

    @Ignore    private SampleClass450 sampleClass;

    public SampleClass449(){
        sampleClass = new SampleClass450();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}