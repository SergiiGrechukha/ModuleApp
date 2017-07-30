package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass462 {

    @Ignore    private SampleClass463 sampleClass;

    public SampleClass462(){
        sampleClass = new SampleClass463();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}