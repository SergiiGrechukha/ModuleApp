package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1832 {

    @Ignore    private SampleClass1833 sampleClass;

    public SampleClass1832(){
        sampleClass = new SampleClass1833();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}