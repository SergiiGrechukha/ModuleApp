package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1429 {

    @Ignore    private SampleClass1430 sampleClass;

    public SampleClass1429(){
        sampleClass = new SampleClass1430();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}