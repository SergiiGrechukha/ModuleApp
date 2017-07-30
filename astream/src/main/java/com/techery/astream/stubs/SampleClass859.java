package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass859 {

    @Ignore    private SampleClass860 sampleClass;

    public SampleClass859(){
        sampleClass = new SampleClass860();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}