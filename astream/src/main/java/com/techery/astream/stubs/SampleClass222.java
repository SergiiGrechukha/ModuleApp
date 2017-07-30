package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass222 {

    @Ignore    private SampleClass223 sampleClass;

    public SampleClass222(){
        sampleClass = new SampleClass223();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}