package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1627 {

    @Ignore    private SampleClass1628 sampleClass;

    public SampleClass1627(){
        sampleClass = new SampleClass1628();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}