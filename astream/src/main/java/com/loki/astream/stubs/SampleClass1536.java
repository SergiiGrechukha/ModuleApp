package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1536 {

    @Ignore    private SampleClass1537 sampleClass;

    public SampleClass1536(){
        sampleClass = new SampleClass1537();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}