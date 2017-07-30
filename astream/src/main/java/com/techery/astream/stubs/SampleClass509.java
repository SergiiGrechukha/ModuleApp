package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass509 {

    @Ignore    private SampleClass510 sampleClass;

    public SampleClass509(){
        sampleClass = new SampleClass510();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}