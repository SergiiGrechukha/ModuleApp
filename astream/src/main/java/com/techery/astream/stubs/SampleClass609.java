package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass609 {

    @Ignore    private SampleClass610 sampleClass;

    public SampleClass609(){
        sampleClass = new SampleClass610();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}