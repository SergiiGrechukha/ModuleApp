package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1006 {

    @Ignore    private SampleClass1007 sampleClass;

    public SampleClass1006(){
        sampleClass = new SampleClass1007();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}