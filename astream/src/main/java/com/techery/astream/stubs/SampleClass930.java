package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass930 {

    @Ignore    private SampleClass931 sampleClass;

    public SampleClass930(){
        sampleClass = new SampleClass931();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}