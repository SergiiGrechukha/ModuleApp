package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass246 {

    @Ignore    private SampleClass247 sampleClass;

    public SampleClass246(){
        sampleClass = new SampleClass247();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}