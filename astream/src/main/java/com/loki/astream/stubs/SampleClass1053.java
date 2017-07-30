package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1053 {

    @Ignore    private SampleClass1054 sampleClass;

    public SampleClass1053(){
        sampleClass = new SampleClass1054();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}