package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass567 {

    @Ignore    private SampleClass568 sampleClass;

    public SampleClass567(){
        sampleClass = new SampleClass568();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}