package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass787 {

    @Ignore    private SampleClass788 sampleClass;

    public SampleClass787(){
        sampleClass = new SampleClass788();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}