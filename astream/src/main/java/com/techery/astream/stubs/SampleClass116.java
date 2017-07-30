package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass116 {

    @Ignore    private SampleClass117 sampleClass;

    public SampleClass116(){
        sampleClass = new SampleClass117();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}