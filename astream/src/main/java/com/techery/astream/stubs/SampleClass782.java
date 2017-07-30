package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass782 {

    @Ignore    private SampleClass783 sampleClass;

    public SampleClass782(){
        sampleClass = new SampleClass783();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}