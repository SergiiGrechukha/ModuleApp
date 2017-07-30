package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1106 {

    @Ignore    private SampleClass1107 sampleClass;

    public SampleClass1106(){
        sampleClass = new SampleClass1107();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}