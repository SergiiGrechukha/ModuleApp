package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass647 {

    @Ignore    private SampleClass648 sampleClass;

    public SampleClass647(){
        sampleClass = new SampleClass648();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}