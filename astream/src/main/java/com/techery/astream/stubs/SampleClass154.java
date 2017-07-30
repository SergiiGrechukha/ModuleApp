package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass154 {

    @Ignore    private SampleClass155 sampleClass;

    public SampleClass154(){
        sampleClass = new SampleClass155();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}