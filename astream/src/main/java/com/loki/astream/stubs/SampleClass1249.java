package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1249 {

    @Ignore    private SampleClass1250 sampleClass;

    public SampleClass1249(){
        sampleClass = new SampleClass1250();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}