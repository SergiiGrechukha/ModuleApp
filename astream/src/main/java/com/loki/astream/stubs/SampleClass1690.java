package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1690 {

    @Ignore    private SampleClass1691 sampleClass;

    public SampleClass1690(){
        sampleClass = new SampleClass1691();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}