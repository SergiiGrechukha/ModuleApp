package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass382 {

    @Ignore    private SampleClass383 sampleClass;

    public SampleClass382(){
        sampleClass = new SampleClass383();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}