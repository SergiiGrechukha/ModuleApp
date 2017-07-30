package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass611 {

    @Ignore    private SampleClass612 sampleClass;

    public SampleClass611(){
        sampleClass = new SampleClass612();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}