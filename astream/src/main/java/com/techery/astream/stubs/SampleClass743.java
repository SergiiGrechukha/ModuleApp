package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass743 {

    @Ignore    private SampleClass744 sampleClass;

    public SampleClass743(){
        sampleClass = new SampleClass744();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}