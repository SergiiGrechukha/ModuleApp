package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass835 {

    @Ignore    private SampleClass836 sampleClass;

    public SampleClass835(){
        sampleClass = new SampleClass836();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}