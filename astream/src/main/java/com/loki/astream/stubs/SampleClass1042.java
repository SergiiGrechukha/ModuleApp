package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1042 {

    @Ignore    private SampleClass1043 sampleClass;

    public SampleClass1042(){
        sampleClass = new SampleClass1043();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}